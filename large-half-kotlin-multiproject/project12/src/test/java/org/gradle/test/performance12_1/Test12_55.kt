package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_55 {
    private val production = Production12_55("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}