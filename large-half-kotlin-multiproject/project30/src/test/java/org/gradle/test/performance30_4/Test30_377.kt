package org.gradle.test.performance30_4

import org.junit.Assert.*

class Test30_377 {
    private val production = Production30_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}