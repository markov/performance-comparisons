package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_94 {
    private val production = Production12_94("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}