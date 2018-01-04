package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_473 {
    private val production = Production12_473("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}