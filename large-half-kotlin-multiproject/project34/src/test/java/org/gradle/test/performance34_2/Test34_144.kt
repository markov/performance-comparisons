package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_144 {
    private val production = Production34_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}