package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_178 {
    private val production = Production30_178("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}