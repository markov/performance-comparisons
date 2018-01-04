package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_488 {
    private val production = Production36_488("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}