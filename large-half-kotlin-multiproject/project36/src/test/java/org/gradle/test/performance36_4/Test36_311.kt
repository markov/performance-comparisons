package org.gradle.test.performance36_4

import org.junit.Assert.*

class Test36_311 {
    private val production = Production36_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}