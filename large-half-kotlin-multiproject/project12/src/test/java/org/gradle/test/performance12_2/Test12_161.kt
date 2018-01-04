package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_161 {
    private val production = Production12_161("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}