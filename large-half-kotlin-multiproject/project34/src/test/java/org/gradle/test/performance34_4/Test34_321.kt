package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_321 {
    private val production = Production34_321("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}