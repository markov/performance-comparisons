package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_411 {
    private val production = Production36_411("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}