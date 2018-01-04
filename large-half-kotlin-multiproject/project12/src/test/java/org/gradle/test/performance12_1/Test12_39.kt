package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_39 {
    private val production = Production12_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}