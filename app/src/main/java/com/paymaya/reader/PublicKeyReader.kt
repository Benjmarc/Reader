package com.paymaya.reader

import java.nio.file.Files
import java.nio.file.Paths

/**
 * reads a public key from a file
 * @param filename name of the file to read
 * @return the read public key
 */
class PublicKeyReader {
    fun getPublicKey(path: String): String {
        val keyBytes: ByteArray = Files.readAllBytes(Paths.get("$path/bryan-android.public.key"))
        return keyBytes.toString()
    }
}
