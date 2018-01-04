package org.gradle.test.performance36_2

import org.junit.Assert.*

class Test36_151 {
    private val production = Production36_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}