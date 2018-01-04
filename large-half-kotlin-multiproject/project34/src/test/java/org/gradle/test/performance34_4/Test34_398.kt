package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_398 {
    private val production = Production34_398("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}