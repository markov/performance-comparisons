package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_348 {
    private val production = Production12_348("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}