package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_485 {
    private val production = Production12_485("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}