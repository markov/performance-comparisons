package org.gradle.test.performance36_3

import org.junit.Assert.*

class Test36_264 {
    private val production = Production36_264("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}