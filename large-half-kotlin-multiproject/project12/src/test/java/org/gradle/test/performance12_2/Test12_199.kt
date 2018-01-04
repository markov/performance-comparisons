package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_199 {
    private val production = Production12_199("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}