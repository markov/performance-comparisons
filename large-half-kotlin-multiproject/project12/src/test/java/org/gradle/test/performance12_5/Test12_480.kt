package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_480 {
    private val production = Production12_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}