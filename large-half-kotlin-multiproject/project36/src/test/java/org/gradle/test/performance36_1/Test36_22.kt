package org.gradle.test.performance36_1

import org.junit.Assert.*

class Test36_22 {
    private val production = Production36_22("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}