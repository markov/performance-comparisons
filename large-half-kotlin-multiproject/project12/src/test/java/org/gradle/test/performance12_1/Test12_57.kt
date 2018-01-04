package org.gradle.test.performance12_1

import org.junit.Assert.*

class Test12_57 {
    private val production = Production12_57("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}