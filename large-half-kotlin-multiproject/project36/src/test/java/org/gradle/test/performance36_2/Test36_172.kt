package org.gradle.test.performance36_2

import org.junit.Assert.*

class Test36_172 {
    private val production = Production36_172("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}