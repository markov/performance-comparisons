package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_419 {
    private val production = Production12_419("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}