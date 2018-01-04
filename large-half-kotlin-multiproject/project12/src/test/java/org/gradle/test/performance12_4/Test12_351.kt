package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_351 {
    private val production = Production12_351("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}