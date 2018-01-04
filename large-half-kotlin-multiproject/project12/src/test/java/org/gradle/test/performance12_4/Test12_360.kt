package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_360 {
    private val production = Production12_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}