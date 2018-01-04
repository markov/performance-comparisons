package org.gradle.test.performance36_3

import org.junit.Assert.*

class Test36_297 {
    private val production = Production36_297("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}