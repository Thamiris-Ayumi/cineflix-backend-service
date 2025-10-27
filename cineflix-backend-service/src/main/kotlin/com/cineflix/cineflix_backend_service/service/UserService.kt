package com.cineflix.cineflix_backend_service.service

import com.cineflix.cineflix_backend_service.model.User
import com.cineflix.cineflix_backend_service.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.NoSuchElementException

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: UUID): User =
        userRepository.findById(id).orElseThrow { NoSuchElementException("Usuário com ID $id não encontrado") }

    fun getUserByEmail(email: String): User? = userRepository.findByEmail(email)

    fun getUserByName(name: String): User? = userRepository.findByName(name)

    fun createUser(user: User): User = userRepository.save(user)

    fun updateUser(id: UUID, updatedUser: User): User {
        val existing = getUserById(id)
        val updated = existing.copy(
            name = updatedUser.name,
            email = updatedUser.email,
            password = updatedUser.password
        )
        return userRepository.save(updated)
    }

    fun deleteUser(id: UUID) {
        if (!userRepository.existsById(id)) {
            throw NoSuchElementException("User with ID $id not found.")
        }
        userRepository.deleteById(id)
    }
}