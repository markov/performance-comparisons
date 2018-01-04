package org.gradle.test.performance12_5

import org.junit.Assert.*

class Test12_403 {
    private val production = Production12_403("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}