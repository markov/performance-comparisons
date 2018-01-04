package org.gradle.test.performance19_3

import org.junit.Assert.*

class Test19_260 {
    private val production = Production19_260("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}