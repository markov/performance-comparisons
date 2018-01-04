package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_489 {
    private val production = Production12_489("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}