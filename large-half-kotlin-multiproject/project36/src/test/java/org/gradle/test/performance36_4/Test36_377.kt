package org.gradle.test.performance36_4

import org.junit.Assert.*

class Test36_377 {
    private val production = Production36_377("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}