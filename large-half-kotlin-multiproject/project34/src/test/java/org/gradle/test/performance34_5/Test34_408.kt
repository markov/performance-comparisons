package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_408 {
    private val production = Production34_408("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}