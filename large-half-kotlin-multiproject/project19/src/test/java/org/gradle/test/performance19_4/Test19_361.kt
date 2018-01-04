package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_361 {
    private val production = Production19_361("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}