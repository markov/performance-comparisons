package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_499 {
    private val production = Production12_499("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}