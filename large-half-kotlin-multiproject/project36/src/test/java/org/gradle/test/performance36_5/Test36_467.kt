package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_467 {
    private val production = Production36_467("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}