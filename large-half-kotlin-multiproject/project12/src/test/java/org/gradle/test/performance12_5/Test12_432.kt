package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_432 {
    private val production = Production12_432("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}