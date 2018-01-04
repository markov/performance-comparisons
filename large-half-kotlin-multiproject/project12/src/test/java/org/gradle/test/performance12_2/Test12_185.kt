package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_185 {
    private val production = Production12_185("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}