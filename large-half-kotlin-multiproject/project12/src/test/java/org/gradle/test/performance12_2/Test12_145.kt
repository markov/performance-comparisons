package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_145 {
    private val production = Production12_145("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}