package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_15 {
    private val production = Production12_15("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}