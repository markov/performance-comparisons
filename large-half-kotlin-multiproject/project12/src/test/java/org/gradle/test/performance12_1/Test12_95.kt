package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_95 {
    private val production = Production12_95("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}