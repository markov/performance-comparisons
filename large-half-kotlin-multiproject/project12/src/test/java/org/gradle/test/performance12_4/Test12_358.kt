package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_358 {
    private val production = Production12_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}