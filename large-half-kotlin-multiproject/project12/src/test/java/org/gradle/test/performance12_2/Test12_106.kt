package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_106 {
    private val production = Production12_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}