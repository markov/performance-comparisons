package org.gradle.test.performance12_2

import org.junit.Assert.*

class Test12_195 {
    private val production = Production12_195("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}