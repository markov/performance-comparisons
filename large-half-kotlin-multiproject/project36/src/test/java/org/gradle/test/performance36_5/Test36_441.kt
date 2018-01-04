package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_441 {
    private val production = Production36_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}