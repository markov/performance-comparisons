package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_313 {
    private val production = Production12_313("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}