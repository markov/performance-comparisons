package org.gradle.test.performance30_3

import org.junit.Assert.*

class Test30_271 {
    private val production = Production30_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}