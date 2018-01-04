package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_490 {
    private val production = Production36_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}