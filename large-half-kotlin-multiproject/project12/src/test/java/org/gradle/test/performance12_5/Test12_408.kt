package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_408 {
    private val production = Production12_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}