package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_191 {
    private val production = Production12_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}