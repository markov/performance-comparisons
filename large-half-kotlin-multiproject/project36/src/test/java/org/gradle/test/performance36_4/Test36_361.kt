package org.gradle.test.performance36_4

import org.junit.Assert.*

class Test36_361 {
    private val production = Production36_361("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}