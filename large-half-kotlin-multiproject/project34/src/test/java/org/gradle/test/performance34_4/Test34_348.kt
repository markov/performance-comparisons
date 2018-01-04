package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_348 {
    private val production = Production34_348("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}