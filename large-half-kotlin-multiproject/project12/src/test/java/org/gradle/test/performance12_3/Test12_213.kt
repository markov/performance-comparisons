package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_213 {
    private val production = Production12_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}