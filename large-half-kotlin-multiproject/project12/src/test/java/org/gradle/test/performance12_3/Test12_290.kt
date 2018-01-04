package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_290 {
    private val production = Production12_290("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}